package com;
//import org.json.JSONObject;

import com.NSSFDataModel.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jhc on 2018/10/13
 */
@Api
@RestSchema(schemaId="Nnssf_NSSelection")
@RequestMapping("/")
//@RestController
public class Nnssf_NSSelection {
//    @ApiResponses({
//            @ApiResponse(code=200,message = "OK (Successful Network Slice Selection)",response = AuthorizedNetworkSliceInfo.class),
//            @ApiResponse(code=403,message="Forbidden",response = ProblemDetails.class)
//    })
/**
 *     private List<SubscribedSnssai> subscribedNssai;
 *     private AllowedNssai allowedNssai;
 *     private List<Snssai> sNssaiForMapping;
 *     private List<MappingOfRequestedSnssai> mappingOfRequestedNssai;
 *     private List<Snssai>  requestedNssai;
 *     private boolean requestMapping;
 */
    @RequestMapping(value="network-slice-information",method = RequestMethod.POST)
//    public AuthorizedNetworkSliceInfo select(@RequestBody  NetworkSliceInformation networkSliceInformation){
    public AuthorizedNetworkSliceInfo select(@RequestBody  NetworkSliceInformation networkSliceInformation){
        SliceInfoForRegistration sliceInfo = networkSliceInformation.getSliceInfoForRegistration();
        System.out.println(networkSliceInformation);
        String nrfAmfSet="";
        /**
         * temp1是暂时定义在NSSF内部的Snssai序列号
         */
        Snssai temp1 = new Snssai();
        temp1.setSst(1);
        temp1.setSd("");
        Snssai temp2 = new Snssai();
        temp2.setSd("");
        temp2.setSst(2);
        Snssai temp3 = new Snssai();
        temp3.setSst(3);
        temp3.setSd("");
        System.out.println(sliceInfo);
        /**
         * 假设在NSSF中存储了三种类型的切片，如果Snssai为1 表示AMF1，Snssai2,表示AMF2，Snssai3表示AMF3
         */
        List<Snssai> requestNssai  = sliceInfo.getRequestedNssai();
        for(Snssai snssai:requestNssai){
            if(snssai.getSd() == temp1.getSd()){
                nrfAmfSet = "AMF1";
                break;
            }else if(snssai.getSd() == temp2.getSd()){
                nrfAmfSet = "AMF2";
            }else  if(snssai.getSd() == temp3.getSd()){
                nrfAmfSet = "AMF3";
            }
        }
        AuthorizedNetworkSliceInfo info = new AuthorizedNetworkSliceInfo();
        info.setNrfAmfSet(nrfAmfSet);
        return info;
    }

//    public AuthorizedNetworkSliceInfo Get(
//            @ApiParam(name="nf-type",value="nf-type",required = false)
//            @RequestParam(name="nfType",required = true)
//            NFType nfType,
//            @ApiParam(name="nf-id",value="nf-id",required = true)
//          @RequestParam(name="nfInstanceId",required = true)
//            String nfInstnceId,
////            @ApiParam(name="slice-info-request-for-registration",value="slice-info-request-for-registration")
////            @RequestParam(name="sliceInfoForRegistration")
//            @RequestBody SliceInfoForRegistration sliceInfoForRegistration,
////            @ApiParam(name="slice-info-request-for-pdu-session",value="slice-info-request-for-pdu-session")
////            SliceInfoForPDUSession sliceInfoForPDUSession,
////            @ApiParam(name="home-plmn-id",value = "home-plmn-id")
////             PlmnId plmnId,
////            @ApiParam(name="tai",value = "tai") Tai tai,
////            @ApiParam(name="supported-features",value="supported-features")
//           @RequestParam(name="supportedFeatures")
//            String supportedFeatures
//
//    ){
//        return null;
//    }

}
