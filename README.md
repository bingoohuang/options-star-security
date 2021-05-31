# Bypass Allow header in response to `OPTIONS *`

```sh
$ http-raw -addr localhost:8001 -input "OPTIONS * HTTP/1.1\nHost: localhost:5003"
Request: "OPTIONS * HTTP/1.1\r\nHost: localhost:5003\r\n\r\n"

HTTP/1.1 200
Allow: GET, HEAD, POST, PUT, DELETE, OPTIONS
Content-Length: 0
Date: Mon, 31 May 2021 07:12:12 GMT

```

After customizing `org.apache.catalina.connector.CoyoteAdapter` in `tomcat-embed-core-9.0.46.jar`, comment out 620-650
lines

```sh
$ http-raw -addr localhost:8001 -input "OPTIONS * HTTP/1.1\nHost: localhost:5003"
Request: "OPTIONS * HTTP/1.1\r\nHost: localhost:5003\r\n\r\n"

HTTP/1.1 200 
Content-Length: 0
Date: Mon, 31 May 2021 07:14:17 GMT

```

1. [http-raw](https://github.com/bingoohuang/gobench/blob/master/cmd/http-raw/main.go)
