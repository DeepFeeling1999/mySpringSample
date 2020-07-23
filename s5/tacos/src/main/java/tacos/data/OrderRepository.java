package tacos.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import tacos.Order;
import tacos.User;

import java.util.List;

public interface OrderRepository 
         extends CrudRepository<Order, Long> {
    /**
     * 找到用户的历史订单，按订单时间降序排序
     * @param user 用户
     * @param pageable Spring Data根据页号和每页数量选取结果的子集的一种方法
     * @return 返回订单列表
     */
    List<Order> findByUserOrderByPlacedAtDesc(
            User user,   Pageable pageable);
}
