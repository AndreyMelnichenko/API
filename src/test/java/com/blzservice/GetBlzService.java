package com.blzservice;

import com.thomas_bayer.blz.BLZService;
import com.thomas_bayer.blz.DetailsType;
import com.thomas_bayer.blz.GetBankType;
import org.testng.annotations.Test;

import javax.lang.model.type.DeclaredType;

import static org.testng.Assert.assertEquals;


public class GetBlzService {

    BLZService blzService = new BLZService();

    @Test
    public void setBlzService(){
        DetailsType detailsType = blzService.getBLZServiceSOAP11PortHttp().getBank("57020086");
        System.out.println("Bank Name: "+detailsType.getBezeichnung());
        System.out.println("Address: " +detailsType.getOrt());
        System.out.println("ORT Code: "+detailsType.getPlz());
        System.out.println("BIC/SWIFT Code: "+detailsType.getBic());
        assertEquals("56003",detailsType.getPlz());
    }
}
