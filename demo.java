public class VaultDemoOrderServiceApplication  {

  private static final Logger logger = LoggerFactory.getLogger(VaultDemoOrderServiceApplication.class);

  @Autowired
  private SessionManager sessionManager;

  @Value("${spring.datasource.username}")
  private String dbUser;

  @Value("${spring.datasource.password}")
  private String dbPass;

  public static void main(String[] args) {
    SpringApplication.run(VaultDemoOrderServiceApplication.class, args);
  }

  @PostConstruct
  public void initIt() throws Exception {
    logger.info("Got Vault Token: " + sessionManager.getSessionToken().getToken());
    logger.info("Got DB User: " + dbUser);
  }
}

