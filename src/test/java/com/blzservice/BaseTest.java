package com.blzservice;

import com.thomas_bayer.blz.BLZService;
import com.thomas_bayer.blz.BLZServicePortType;
import com.utils.JaxWsHandlerResolver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected BLZService blzService = new BLZService();
    protected BLZServicePortType serviceClient;

    @BeforeClass
    public void setUp(){
        blzService.setHandlerResolver(new JaxWsHandlerResolver());
        serviceClient = blzService.getBLZServiceSOAP11PortHttp();
    }
}
