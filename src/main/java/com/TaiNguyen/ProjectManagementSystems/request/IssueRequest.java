package com.TaiNguyen.ProjectManagementSystems.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IssueRequest {
    private String title;
    private String description;
    private String status;
    private Long projectId;
    private String priority;
    private String price;
    private LocalDate dueDate;
    private LocalDate startDate;

}