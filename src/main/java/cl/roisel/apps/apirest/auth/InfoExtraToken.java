package cl.roisel.apps.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import cl.roisel.apps.apirest.models.entity.Usuario;
import cl.roisel.apps.apirest.models.services.IUsuarioService;

@Component
public class InfoExtraToken implements TokenEnhancer{
	
	@Autowired private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		
		Map<String,Object> adicional = new HashMap<>();
		adicional.put("idcarro", 98765);
		adicional.put("usuario", authentication.getName());
		adicional.put("email", usuario.getEmail());
		adicional.put("nombre", usuario.getNombre());
		adicional.put("apellido", usuario.getApellido());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(adicional);
		return accessToken;
	}

}
