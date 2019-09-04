Feature: hello world
  This is the first feature for pandaria

  Scenario: hello world
    * uri: https://github.com
    * send: GET
    * status: 200

  Scenario: get weather
    * uri: https://www.apiopen.top/weatherApi?city=%E9%83%91%E5%B7%9E
    * send: GET
    * status: 200
    * verify: '$.msg'='成功!'
    * verify: '$.data.city'='郑州'