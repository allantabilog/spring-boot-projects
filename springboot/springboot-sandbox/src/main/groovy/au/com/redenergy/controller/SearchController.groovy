package au.com.redenergy.controller

import au.com.redenergy.domain.GasMeter
import au.com.redenergy.domain.SearchParameters
import au.com.redenergy.service.SearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @Autowired
    SearchService searchService

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    List<GasMeter> search(@RequestBody SearchParameters parameters) {
        searchService.findByMirn()
    }

}
