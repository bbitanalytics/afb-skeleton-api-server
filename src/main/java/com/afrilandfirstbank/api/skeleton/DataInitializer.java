package com.afrilandfirstbank.api.skeleton;

import com.afrilandfirstbank.api.skeleton.dao.entity.ApiObj;
import com.afrilandfirstbank.api.skeleton.dao.entity.ApiObject;
import com.afrilandfirstbank.api.skeleton.dao.repository.ApiObjRepository;
import com.afrilandfirstbank.api.skeleton.dao.repository.ApiObjectRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

  private final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

  @Autowired
  ApiObjRepository apiobjRepository;

  @Autowired
  ApiObjectRepository apiobjectRepository;

  public void initData() {

    initApiObjData(); // init first entity data

    initApiObjectData(); // init second entity data

  }

  private void initApiObjData() {

    try {
      ApiObj apiobj = new ApiObj();
      apiobj.setName("APIMakenene");
      apiobjRepository.save(apiobj);

      apiobj = new ApiObj();
      apiobj.setName("APIBandjoun");
      apiobjRepository.save(apiobj);

      apiobj = new ApiObj();
      apiobj.setName("APIDschang");
      apiobjRepository.save(apiobj);

      apiobj = new ApiObj();
      apiobj.setName("APITonga");
      apiobjRepository.save(apiobj);

      apiobj = new ApiObj();
      apiobj.setName("APIDouala");
      apiobjRepository.save(apiobj);

      apiobj = new ApiObj();
      apiobj.setName("JAPINkonsamba");
      apiobjRepository.save(apiobj);

    } catch (final Exception ex) {
      logger.error("Exception while inserting mock data into apiobj {}", ex);
    }

  }

  private void initApiObjectData() {

    try {
      ApiObject apiobject = new ApiObject();

        apiobject.setName("bafia-api");
        apiobject.setDescription("The Application Programming Interface for Bafia ");
        apiobject.setUrl("/api/bafia");
        apiobject.setLink("http://bafia.com:9000");
        apiobject.setToken("Bafia123456789");
        apiobjectRepository.save(apiobject);

        apiobject = new ApiObject();
        apiobject.setName("ombessa-api");
        apiobject.setDescription("The Application Programming Interface for Ombessa ");
        apiobject.setUrl("/api/ombessa");
        apiobject.setLink("http://ombessa.com:9000");
        apiobject.setToken("Ombessa123456789");
        apiobjectRepository.save(apiobject);

        apiobject = new ApiObject();
        apiobject.setName("ndikinimeki-api");
        apiobject.setDescription("The Application Programming Interface for Ndikinimeki ");
        apiobject.setUrl("/api/ndikinimeki");
        apiobject.setLink("http://ndikinimeki.com:9000");
        apiobject.setToken("Ndikinimeki123456789");
        apiobjectRepository.save(apiobject);

        apiobject = new ApiObject();
        apiobject.setName("ntonga-api");
        apiobject.setDescription("The Application Programming Interface for Ntonga ");
        apiobject.setUrl("/api/ntonga");
        apiobject.setLink("http://ntonga.com:9000");
        apiobject.setToken("Ntonga1123456789");
        apiobjectRepository.save(apiobject);

        apiobject = new ApiObject();
        apiobject.setName("nyokon-api");
        apiobject.setDescription("The Application Programming Interface for Nyokon ");
        apiobject.setUrl("/api/nyokon");
        apiobject.setLink("http://makenene.com:9000");
        apiobject.setToken("Nyokon123456789");
        apiobjectRepository.save(apiobject);

        } catch (final Exception ex) {
            logger.error("Exception while inserting mock data into apiobject {}", ex);
        }
  }

}
