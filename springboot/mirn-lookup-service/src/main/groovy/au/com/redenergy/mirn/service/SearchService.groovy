package au.com.redenergy.mirn.service

import au.com.redenergy.mirn.domain.Address
import au.com.redenergy.mirn.domain.Meter

interface SearchService {
    /**
     * Find a meter by MIRN
     * @param mirn a MIRN
     * @return a Meter
     */
    List<Meter> findByMirn(String brand, String mirn)

    /**
     * Find a meter by meter number
     * @param meterNumber a meter number
     * @return a meter
     */
    List<Meter> findByMeterNumber(String brand, String meterNumber)

    /**
     * Find a meter by address
     * @param address an address object containing some address info
     * @return a meter
     */
    List<Meter> findByAddress(String brand, Address address)

}
