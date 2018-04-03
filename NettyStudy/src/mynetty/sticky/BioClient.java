package mynetty.sticky;

import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * Created by yuan on 2018/3/15.
 */
public class BioClient {

    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10101);

        //粘包分包的问题 = 定义一个结构 例如 长度+内容
//        for(int i=0;i<1000;i++){
//            socket.getOutputStream().write("hello".getBytes());
//        }

        byte[] data="abc".getBytes();

        ByteBuffer buffer=ByteBuffer.allocate(4+data.length);
        buffer.putInt(data.length);
        buffer.put(data);

        for(int i=0;i<1000;i++){
            socket.getOutputStream().write(buffer.array());
        }



        socket.close();
    }
}
