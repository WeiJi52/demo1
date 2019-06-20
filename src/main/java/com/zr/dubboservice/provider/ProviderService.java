package com.zr.dubboservice.provider;
import java.util.List;

import com.zr.model.User;
public interface ProviderService {
	List<User> selectAllUsers();
}
