package org.unilab.uniplan.category;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.unilab.uniplan.category.dto.CategoryDto;
import org.unilab.uniplan.category.dto.CategoryRequestDto;
import org.unilab.uniplan.category.dto.CategoryResponseDto;

@Mapper
public interface CategoryMapper {

    Category toEntity(final CategoryDto categoryDto);

    CategoryDto toDto(final Category category);

    CategoryDto toInternalDto(final CategoryRequestDto categoryRequestDto);

    CategoryResponseDto toResponseDto(final CategoryDto categoryDto);

    List<CategoryDto> toDtoList(final List<Category> categories);

    List<CategoryResponseDto> toResponseDtoList(final List<CategoryDto> categories);

    @Mapping(target = "roomType", source = "categoryDto.roomType")
    @Mapping(target = "capacity", source = "categoryDto.capacity")
    void updateEntityFromDto(final CategoryDto categoryDto,
                             @MappingTarget final Category category);
}
