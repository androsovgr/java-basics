package ru.mephi.java.ch03.sec01;

import java.io.Closeable;
import java.io.IOException;

public class ChannelImpl implements Channel {
  // ...
  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean isOpen() {
    // TODO Auto-generated method stub
    return false;
  }

  public static void main(String[] args) throws Exception {
    ChannelImpl ci = new ChannelImpl();
    ci.isOpen();
    ci.close();
    Channel c = ci;
    c.isOpen();
    c.close();
    Closeable cl = ci;
    cl.close();
  }
}
