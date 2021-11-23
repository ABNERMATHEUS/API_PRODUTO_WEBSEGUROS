package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.UserCustom;
import org.javatuples.Pair;


public interface IUserService {

    Pair<String,String> GetByEmail(String email);

    UserCustom Save(UserCustom userCustom);
}
