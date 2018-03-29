package com.geoipservice;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GetGeoIpServiceTest {

    GeoIPService geoIPService = new GeoIPService();

    @Test
    public void setGeoIPService(){
        GeoIP geoIP = geoIPService.getGeoIPServiceSoap().getGeoIP("255.255.255.254");
        assertEquals(geoIP.getCountryName(),"567676u6");
    }
}
