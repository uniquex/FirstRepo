/*
package com.example.liquibase.Scheduler;


*/
/*
@Component
*//*

public class PlayerScheduler {
*/
/*    private final PlayerService playerService;
    private  PlayerRepository playerRepository;

    Logger log = LoggerFactory.getLogger(PlayerScheduler.class);

    public PlayerScheduler(PlayerService playerService) {
        this.playerService = playerService;
    }*//*


  */
/*  @Scheduled(fixedDelay = 5000)
    void addNewPlayer(){
        log.info("Scheduler metodu");
        Random random = new Random();
        PlayerRequest playerRequest = new PlayerRequest("ilham",random.nextInt());
        playerService.addPlayer(playerRequest);
    }

    @Scheduled(cron ="4****?")
    void fetchPlayers(){
        List<PlayerDto> playerDtoList = PlayerMapper.INSTANCE.entityToDtoList(playerRepository.findAll());
        log.info("Players: {}",playerDtoList);
        log.info("LocalDate = : {}",LocalDate.now());
    }*//*

}
*/
