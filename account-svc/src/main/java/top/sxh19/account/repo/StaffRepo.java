package top.sxh19.account.repo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.sxh19.account.dmo.Staff;

import java.util.List;
@Mapper
@Repository
public interface StaffRepo {
    public List<Staff> getStaffs();

}
