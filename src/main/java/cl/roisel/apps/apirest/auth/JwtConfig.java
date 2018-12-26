package cl.roisel.apps.apirest.auth;

public class JwtConfig {

	public static final String RSA_PRIVATE_KEY = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAwkZr9vRhrAO/g3TR/nyxe+a40MAlBOQz2Vc1zlTLBix8Q519\r\n" + 
			"aeX8nvjbHogRQVcArf7SBcidXkcMpGxxkmHvFxdp/Ro1xHxIWYg0o12AEANx0apI\r\n" + 
			"YmhqokvGZuWlvy+qQkUe27Trv9jmcVZ7vcgi6hgIf6dloTFDESAO9rV4uJSVwNqK\r\n" + 
			"ffeEghLpshm5N8hpyIVLM2lgIK8WVKSWG823skFXEGDgD3fD9nRIAsrcbQbJESfy\r\n" + 
			"6MB8Vj8Z3AXVhCft+eKspe2FSqTFavqU+h6KkizluUodgBDGMQH5QqPuHUfGXEgw\r\n" + 
			"TcwT/j2XBiWZxFuIdURm8r0teY/RkquS1sm5jwIDAQABAoIBACXUxM1wRVzT1gVp\r\n" + 
			"SENAUOeJxE+SOyM6tQYLv4SQaoCnRQN9taBbktf6KeFGKeYJZS58wrUxncNwHnwe\r\n" + 
			"SfdxbreWbaNF6VZ7xTL6HRX67ScxJIbpm/Ld1nYIP3hmG+KhC4ygHSQ3lPjk6esE\r\n" + 
			"JlCMmo/vYihJlrbO+vpovcE5EWsP3NMAVUslCPK0KaWrPzhoNLRhs5a42MxV4hZR\r\n" + 
			"pX6902BVkh8UcrVz0m9K+npTb+QaovsVM8DO9GHvGgi+w+4q1W9YwxQZlgAOgH0e\r\n" + 
			"eisXgFzg9Te8VWeUOcp+ZWrivKPvjOfoFaefgNfrKV3RSVWQGO5CxPdO0j6cLPMc\r\n" + 
			"Ce0cPTECgYEA9vAiQS2F17RbRVIdcElEhIUzL6ckjiM7In1R+meO+VlolFKabAg0\r\n" + 
			"R5a4gTCeoEDWPMWD+4w6pq+urETIf44yE2ZKrjRM4ykyMkRNh0itFOJWA0xJUcwF\r\n" + 
			"cYNpxGegpZoHVaVRKfDDkjHPPYhzbGebFLMpfHOqEbkC0bk175nPTUsCgYEAyWeL\r\n" + 
			"Yx8NA6qrzMc776IuGT7b/2A1larVg4DpVuRcjLdttruOptx8aseIjJT+LIkOBhpK\r\n" + 
			"UsrqlwHD5sstg+snKw1FYVH1zd4eHPfB47y5Kdqo/H1Cpf47XbDCnTg/HD9yVOII\r\n" + 
			"cgJCteJ/F/T0/hXAmk41AkkUHtAHQEuJ1j8kLk0CgYBrgZgoMB15D3g88ccHP56o\r\n" + 
			"4ySptmbfys7P8SdjkPpZ7GbvTBcWuWupTyD8faJRumiLBKK1PRO7xfiR31A62DlM\r\n" + 
			"4Nfah8KBk0nbQIlQQH+5+9/eh7PT/LLR/JhrfYIfFrPiwZpYXA2I9E55R5KYu3J0\r\n" + 
			"zJtfJyv/k0B69dtZeOkbiQKBgQCWl9iuXepSQoxBCvvy2zZS5CCFW//VEC6kLIDM\r\n" + 
			"2uWkxgbAKo+ojpZtFRMx4roGvNgCkiferiEolkZPzL4UtIDN/RdShIEh1KJ5kHum\r\n" + 
			"eFePRxMx78sk6OqkzGVIP2VZDsvDUlt0O+J7s4bKd/uz/LnN5wpV0iS8QVoapiDD\r\n" + 
			"VOUNxQKBgQDjVgA0hTHpzKzAcnb4/7zozCrTdAPlWzC/kUYle8qGCjwVJp6kMCUV\r\n" + 
			"/kWPdquP3iVfCICYuSoqt9B6fLaZQNUCmEZQN8Fk5mymkZBJAi1eNLMv6G+KVByo\r\n" + 
			"WDGzsmx8l69o4VUjPIvOg6/3mJKcMoBzouootvgM+uB3fQ1/t3UH2w==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwkZr9vRhrAO/g3TR/nyx\r\n" + 
			"e+a40MAlBOQz2Vc1zlTLBix8Q519aeX8nvjbHogRQVcArf7SBcidXkcMpGxxkmHv\r\n" + 
			"Fxdp/Ro1xHxIWYg0o12AEANx0apIYmhqokvGZuWlvy+qQkUe27Trv9jmcVZ7vcgi\r\n" + 
			"6hgIf6dloTFDESAO9rV4uJSVwNqKffeEghLpshm5N8hpyIVLM2lgIK8WVKSWG823\r\n" + 
			"skFXEGDgD3fD9nRIAsrcbQbJESfy6MB8Vj8Z3AXVhCft+eKspe2FSqTFavqU+h6K\r\n" + 
			"kizluUodgBDGMQH5QqPuHUfGXEgwTcwT/j2XBiWZxFuIdURm8r0teY/RkquS1sm5\r\n" + 
			"jwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
