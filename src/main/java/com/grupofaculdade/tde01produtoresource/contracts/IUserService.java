package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.User;

public interface IUserService {

    User GetByEmail(String email);

    User Save(User user);
}
