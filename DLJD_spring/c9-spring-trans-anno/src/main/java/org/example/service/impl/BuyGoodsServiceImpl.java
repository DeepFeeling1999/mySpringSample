package org.example.service.impl;

import org.example.dao.GoodsDao;
import org.example.dao.SaleDao;
import org.example.domain.Goods;
import org.example.domain.Sale;
import org.example.exception.NotEnoughException;
import org.example.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dell
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    /**
     *rollbackFor:表示发生指定异常就回滚
     * 处理逻辑是
     *  1)spring框架会首先检查方法抛出的异常是不是在rollbackFor属性值中
     *  如果异常在rollbackFor列表中，不管是什么类型的异常，一定回滚
     *  2）如果你的抛出的异常不在rollback列表中，spring会判断异常
     *  是不是RuntimeException异常，如果是，一定会回滚
     */


    /**
     *直接添加 @Transactional这个注解的话使用的是默认的传播行为REQUIRED
     * 默认隔离级别是Isolation.DEFAULT
     * 默认抛出运行时异常回滚事务
     *
     * 此注解放在public方法上
     *
     * 这个注解所在的类会变成代理，是由spring实现
     */
    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NotEnoughException.class,
                    NullPointerException.class
            }
    )
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法开始");
        //记录销售信息，向sale表添加记录
        Sale sale=new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);

        saleDao.insertSale(sale);

        //更新库存
        Goods goods=goodsDao.selectGoods(goodsId);
        if(goods==null){
            //商品不存在
            throw new NullPointerException(goodsId+"号商品不存在");
        }else if(goods.getAmount()<nums){
            throw new NotEnoughException("商品库存不足");
        }

        Goods buyGoods=new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);

        System.out.println("buy方法完成");
    }


    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

}
