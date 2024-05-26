package com.example.datageneratorservice.service;

import com.example.datageneratorservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);
}
