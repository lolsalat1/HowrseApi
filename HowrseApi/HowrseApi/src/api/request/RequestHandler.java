package api.request;

import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import api.API;
import api.Account;
import api.ApiException;

/**
 * Handles requests (WOW)
 */
public class RequestHandler {

	public RequestHandler(API api) {
		switch(api.locale) {
		case AR:
			apiUrl = "https://ar.howrse.com/";
			break;
		case AU:
			apiUrl = "https://au.howrse.com/";
			break;
		case BG:
			apiUrl = "https://www.howrse.bg/";
			break;
		case BR:
			apiUrl = "https://br.howrse.com/";
			break;
		case CA:
			apiUrl = "https://ca.howrse.com/";
			break;
		case CZ:
			apiUrl = "https://www.howrse.cz/";
			break;
		case DE:
			apiUrl = "https://www.howrse.de/";
			break;
		case DK:
			apiUrl = "https://www.howrse.dk";
			break;
		case ES:
			apiUrl = "https://www.caballow.com/"; // Extrawünsche :O
			break;
		case FI:
			apiUrl = "https://www.howrse.fi/";
			break;
		case FR:
			apiUrl = "https://www.equideow.com/"; // Extrawünsche :P
			break;
		case GB:
			apiUrl = "https://www.howrse.co.uk/";
			break;
		case HU:
			apiUrl = "https://www.howrse.hu/";
			break;
		case IL:
			apiUrl = "https://www.howrse.co.il/";
			break;
		case IT:
			apiUrl = "https://www.howrse.it/";
			break;
		case NL:
			apiUrl = "https://nl.howrse.com/";
			break;
		case NO:
			apiUrl = "https://www.howrse.no/";
			break;
		case PL:
			apiUrl = "https://www.howrse.pl/";
			break;
		case PT:
			apiUrl = "https://www.howrse.com.pt/";
			break;
		case RO:
			apiUrl = "https://www.howrse.ro/";
			break;
		case RU:
			apiUrl = "https://www.lowadi.com/"; // RUSKI?
			break;
		case SE:
			apiUrl = "https://www.howrse.se/";
			break;
		case SI:
			apiUrl = "https://www.howrse.si/";
			break;
		case SK:
			apiUrl = "https://www.howrse.sk/";
			break;
		case US:
			apiUrl = "https://us.howrse.com/";
			break;
		case WORLDWIDE:
			apiUrl = "https://www.howrse.com/";
			break;
		default:
			apiUrl = "https://www.howrse.com/";
			break;
		}
		
		apiHost = apiUrl.split("//")[1].split("/")[0];
		httpclient = HttpClientBuilder.create().build();
	}
	
	/**
	 * Api url
	 */
	public String apiUrl;
	
	/**
	 * Api url prettier 
	 */
	public String apiHost;
	
	/**
	 * HTTP-Client used for requests
	 */
	public CloseableHttpClient httpclient;
	
	/**
	 * Fires a request
	 */
	public CloseableHttpResponse ApiRequest(String url, List<NameValuePair> parameters, Account account) throws ApiException {
		try {
			HttpPost post = new HttpPost(apiUrl + url);
			
			post.setHeader("host", apiHost);
			post.setHeader("User-Agent", account.api.useragent);
			post.setHeader("Cookie", "sessionprod=" + account.api.sessionprod + ";");
			
			post.setEntity(new UrlEncodedFormEntity(parameters));
			
			return httpclient.execute(post);
		} catch(Exception e) {
			throw new ApiException(e, "Couldn't send API-Request");
		}
	}
	
}
