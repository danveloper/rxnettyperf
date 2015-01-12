package perf;

import io.netty.buffer.ByteBuf;
import io.reactivex.netty.RxNetty;
import io.reactivex.netty.protocol.http.server.HttpServer;

public class Main {
    public static void main(String[] args) {
        HttpServer<ByteBuf, ByteBuf> server = RxNetty.createHttpServer(8080, (request, response) ->
                response.writeStringAndFlush("Hello World!") );
        server.startAndWait();
    }
}
