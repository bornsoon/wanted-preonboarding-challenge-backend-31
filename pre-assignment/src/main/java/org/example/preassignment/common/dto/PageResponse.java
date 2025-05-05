package org.example.preassignment.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PageResponse<T> {

    private List<T> items;
    private Pagination pagination;

    @Getter // static 필수
    @AllArgsConstructor
    public static class Pagination {
        private final int totalItems;
        private final int totalPages;
        private final int currentPage;
        private final int perPage;
    }
}
