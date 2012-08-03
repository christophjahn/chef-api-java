package com.ericsson.cloudready.dao;

import java.util.List;

import com.ericsson.cloudready.model.Server;

public interface ServerDAO {
    public List<Server> getServerByIId(String instanceId);
    public void addServer(Server server);
    public boolean deleteServer(String id);
    public boolean deleteServerByIid(String instanceId);
    
}