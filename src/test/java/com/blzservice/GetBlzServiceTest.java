package com.blzservice;

import com.thomas_bayer.blz.BLZService;
import com.thomas_bayer.blz.DetailsType;
import com.utils.JaxWsHandlerResolver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GetBlzService {

    BLZService blzServiceClient = new BLZService();

    @BeforeClass
    public void setUp(){
        blzServiceClient.setHandlerResolver(new JaxWsHandlerResolver());
    }


    //JaxWsHandlerResolver jaxWsHandlerResolver = ;


    @Test
    public void setBlzService(){
        //blzServiceClient.setHandlerResolver(jaxWsHandlerResolver);
        DetailsType detailsType = blzServiceClient.getBLZServiceSOAP11PortHttp().getBank("57020086");
        System.out.println("Bank Name: "+detailsType.getBezeichnung());
        System.out.println("Address: " +detailsType.getOrt());
        System.out.println("ORT Code: "+detailsType.getPlz());
        System.out.println("BIC/SWIFT Code: "+detailsType.getBic());
        assertEquals("56003",detailsType.getPlz());
    }
}
