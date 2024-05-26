package com.example.datageneratorservice.web.controller;

import com.example.datageneratorservice.model.Data;
import com.example.datageneratorservice.service.KafkaDataService;
import com.example.datageneratorservice.web.dto.DataDTO;
import com.example.datageneratorservice.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDTO dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }
}
