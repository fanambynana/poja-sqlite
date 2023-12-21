package poja.sqlite.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.sqlite.base.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
