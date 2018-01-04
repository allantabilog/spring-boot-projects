package au.com.redenergy.service

import au.com.redenergy.domain.GasMeter

interface SearchService {
    List<GasMeter> findByMirn()
}
