package poja.sqlite.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.sqlite.base.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
