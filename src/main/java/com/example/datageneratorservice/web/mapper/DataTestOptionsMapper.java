package com.example.datageneratorservice.web.mapper;

import com.example.datageneratorservice.model.test.DataTestOptions;
import com.example.datageneratorservice.web.dto.DataTestOptionsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDTO> {
}
