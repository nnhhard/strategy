package ru.iashinme.service;

import org.springframework.stereotype.Service;
import ru.iashinme.domain.City;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Service
public class CityServiceImpl implements CityService {

    private final Map<Integer, Strategy> map;

    public CityServiceImpl (List<Strategy> strategyList) {
        map = strategyList.stream().collect(toMap(Strategy::getType, Function.identity()));
    }

    public void printCaption(City city) {
        Strategy strategy = map.getOrDefault(city.getRegionCode(), new StrategyDefaultImpl());
        strategy.save(city.getCityCaption());
    }


}
