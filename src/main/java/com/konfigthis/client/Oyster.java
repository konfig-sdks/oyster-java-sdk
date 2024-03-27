package com.konfigthis.client;

import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.CompanyApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.EngagementsApi;
import com.konfigthis.client.api.ExpensesApi;
import com.konfigthis.client.api.OperationsApi;
import com.konfigthis.client.api.PayrollApi;
import com.konfigthis.client.api.TimeOffApi;

public class Oyster {
    private ApiClient apiClient;
    public final AuthenticationApi authentication;
    public final CompanyApi company;
    public final DepartmentsApi departments;
    public final EngagementsApi engagements;
    public final ExpensesApi expenses;
    public final OperationsApi operations;
    public final PayrollApi payroll;
    public final TimeOffApi timeOff;

    public Oyster() {
        this(null);
    }

    public Oyster(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.company = new CompanyApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.engagements = new EngagementsApi(this.apiClient);
        this.expenses = new ExpensesApi(this.apiClient);
        this.operations = new OperationsApi(this.apiClient);
        this.payroll = new PayrollApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
    }

}
