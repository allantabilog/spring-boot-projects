package au.com.redenergy.service

import au.com.redenergy.domain.Address
import au.com.redenergy.domain.GasMeter
import org.springframework.stereotype.Component

@Component
class StubSearchService implements SearchService {

    List<GasMeter> stubData = Arrays.asList(
            new GasMeter(mirn: 53213910362, meterNumber: '0304QM', address: new Address(addressInfo: '31 DUNBARTON ELTHAM NORTH VIC'))
    )

    @Override
    List<GasMeter> findByMirn() {
        stubData
    }
}
