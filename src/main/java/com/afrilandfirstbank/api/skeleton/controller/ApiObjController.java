package com.afrilandfirstbank.api.skeleton.controller;

import java.util.List;

import com.afrilandfirstbank.api.skeleton.dao.entity.ApiObj;;
import com.afrilandfirstbank.api.skeleton.dao.repository.ApiObjRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="API Manager APP", description="Operations pertaining to API Management")
@RequestMapping("/api")
public class ApiObjController {

    @Autowired
    ApiObjRepository apiobjRepository;

    @ApiOperation(value = "View a list of available Afriland APIs", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping(value = "/apiobjs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ApiObj>> getApiObjs() {
        final List<ApiObj> apiobjs = apiobjRepository.findAll();
        return new ResponseEntity<>(apiobjs, HttpStatus.OK);
    }

}
