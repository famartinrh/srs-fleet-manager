package org.bf2.srs.fleetmanager.service;

import org.bf2.srs.fleetmanager.service.model.QuotaPlan;

public interface QuotaPlansService {

    void init() throws Exception;

    QuotaPlan getDefaultQuotaPlan();
}
