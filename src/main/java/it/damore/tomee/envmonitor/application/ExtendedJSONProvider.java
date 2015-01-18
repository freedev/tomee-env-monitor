/**
 * 
 */
package it.damore.tomee.envmonitor.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

/**
 * @author freedev
 *
 */
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@Provider
public class ExtendedJSONProvider extends MOXyJsonProvider {
	public ExtendedJSONProvider() {

        setAttributePrefix("@");
//        setFormattedOutput(true);
        setIncludeRoot(true);
        setMarshalEmptyCollections(false);
        setValueWrapper("$");
 
/*        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
        namespacePrefixMapper.put("http://www.example.org/customer", "cust");
        setNamespacePrefixMapper(namespacePrefixMapper);
        setNamespaceSeparator(':');
*/
	}
}
