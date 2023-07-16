package com.lius.tiquant.service.biz.account.manager;

import com.lius.tiquant.service.biz.account.model.Account;

public interface AccountManager {
  Account getAccount(String accountId);

  void checkAccountExists(String accountId);

  void saveAccount(Account account);

  void updateAccount(Account account);

  void deleteAccount(String accountId);
}
