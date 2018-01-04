package au.com.redenergy.mirn.service

import au.com.redenergy.mirn.domain.Address
import au.com.redenergy.mirn.domain.Meter
import org.springframework.stereotype.Component

@Component
class StubSearchService implements SearchService {

    List<Meter> stubResult = Arrays.asList(
            new Meter(mirn: '53213910362', meterNumber: '0304QM', address: '31 DUNBARTON ELTHAM NORTH VIC')
    )


    @Override
    List<Meter> findByMirn(String brand, String mirn) {
        stubResult
    }

    @Override
    List<Meter> findByMeterNumber(String brand,String meterNumber) {
        stubResult
    }

    @Override
    List<Meter> findByAddress(String brand, Address address) {
        stubResult
    }
}
