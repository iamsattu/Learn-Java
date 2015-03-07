package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.Api;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;


public class TestScribeOAuth {

	public static void main(String[] args) {
	

		OAuthService service = new ServiceBuilder()
        .provider(TwitterApi.SSL.class)
        .apiKey("UscSzxh4U7jVRWvtOVIHw")
        .apiSecret("eixbaZMrIoSSJWP4pNFH8o316xk5XC8STFEIvQdPu3k")
        .build();
		System.out.println("Service is :" +service);
		
		Token requestToken = service.getRequestToken();
		System.out.println("Request Token is :" +requestToken);
		
		String authUrl = service.getAuthorizationUrl(requestToken);
		System.out.println("Authentication URL is :" +authUrl);
		
		System.out.println("Enter the PIN code and hit ENTER when you're done:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pin = null;
		try {
			 pin = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Verifier v = new Verifier(pin);
	//	Token accessToken = new Token(requestToken, "cA2cZJzwsdTf22aYhGdGfOQzxoXKuvi3XijKiVCsQzhIL");
		Token accessToken = service.getAccessToken(requestToken, v); 
		
		System.out.println("Access Token is :" +accessToken);
		
		OAuthRequest request = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/followers/ids.json?cursor=-1&screen_name=iamsattu&count=5000");
		service.signRequest(accessToken, request); // the access token from step 4
		Response response = request.send();
		System.out.println(response.getBody());

	}

}
