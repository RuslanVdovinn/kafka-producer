package com.example.datageneratorservice.web.mapper;

import com.example.datageneratorservice.model.Data;
import com.example.datageneratorservice.web.dto.DataDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDTO> {
}
