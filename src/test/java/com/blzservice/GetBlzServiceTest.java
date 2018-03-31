package com.blzservice;

import com.thomas_bayer.blz.DetailsType;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GetBlzServiceTest extends BaseTest {

    @Test(priority=1)
    public void setBlzService(){
        DetailsType detailsType = serviceClient.getBank("57020086");
        System.out.println("Bank Name: "+detailsType.getBezeichnung());
        System.out.println("Address: " +detailsType.getOrt());
        System.out.println("ORT Code: "+detailsType.getPlz());
        System.out.println("BIC/SWIFT Code: "+detailsType.getBic());
        assertEquals("56003",detailsType.getPlz());
    }

    @Test(priority=2)
    public void anotherValue(){
        DetailsType bank = serviceClient.getBank("57050120");
        System.out.println(bank.getPlz());
        assertEquals("56013", bank.getPlz());
    }
}