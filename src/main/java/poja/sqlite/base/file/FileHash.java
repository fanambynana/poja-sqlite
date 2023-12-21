package poja.sqlite.base.file;

import poja.sqlite.base.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
