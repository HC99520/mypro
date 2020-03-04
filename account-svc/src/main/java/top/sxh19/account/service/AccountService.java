package top.sxh19.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sxh19.account.dmo.Staff;
import top.sxh19.account.repo.StaffRepo;

import java.util.List;

@Service
public class AccountService implements StaffRepo {
    @Autowired
    StaffRepo staffRepo;

    @Override
    public List<Staff> getStaffs() {
        return staffRepo.getStaffs();
    }
}
