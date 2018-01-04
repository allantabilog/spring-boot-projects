package au.com.redenergy.mirn.controller

import au.com.redenergy.mirn.domain.Meter
import au.com.redenergy.mirn.domain.SearchParameters
import au.com.redenergy.mirn.service.SearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class SearchController {

    @Autowired
    SearchService searchService

    /**
     * TODO: Double-check the logic of this method! May not return what the users expect
     * @param params
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    List<Meter> search(@RequestBody SearchParameters params) {
        if (params.mirn) {
            searchService.findByMirn(params.brand, params.mirn)
        }
        if (params.meterNumber) {
            searchService.findByMeterNumber(params.brand, params.meterNumber)
        }
        if (params.address) {
            searchService.findByAddress(params.brand, params.address)
        }
    }
}
