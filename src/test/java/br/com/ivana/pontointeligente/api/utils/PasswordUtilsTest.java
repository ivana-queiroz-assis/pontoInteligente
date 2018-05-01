package br.com.ivana.pontointeligente.api.utils;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.ivana.pontointeligente.api.utils.PassWordUtils;
public class PasswordUtilsTest {
	
	private static final String SENHA = "123456";
	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

	@Test
	public void testSenhaNula() throws Exception {
		assertNull(PassWordUtils.gerarBCrypt(null));
	}
	
	@Test
	public void testGerarHashSenha() throws Exception {
		String hash = PassWordUtils.gerarBCrypt(SENHA);
		
		assertTrue(bCryptEncoder.matches(SENHA, hash));
	}

}
