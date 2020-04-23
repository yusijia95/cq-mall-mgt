package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.dto.UmsResourceDto;
import club.banyuan.cqmall.service.ResourceService;
import org.aspectj.lang.annotation.AfterReturning;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceServiceImplTest {

    @Autowired
    ResourceService resourceService;

    @Test
    void selectAllResource() {
        resourceService.selectAllResource();
    }

    @Test
    void selectResourceByUsername() {
    }

    @Test
    void selectResourceList() {
    }

    @Test
    void insertResource() {
        UmsResourceDto umsResource=new UmsResourceDto();
        umsResource.setCategoryId(1L);
        umsResource.setCreateTime(new Date());
        umsResource.setDescription("te");
        umsResource.setName("te");
        umsResource.setUrl("te");
        resourceService.insertResource(umsResource);
    }

    @Test
    void updateResource() {
    }

    @Test
    void deleteResource() {
    }
}