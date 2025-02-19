{ pkgs }: {
    deps = [
      pkgs.src
      pkgs.run
      pkgs.haskellPackages.concurrent-dns-cache
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}