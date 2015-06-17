require "rake"

task :source do
  clojure_files = Dir["source/*.clojure"]
  pairs = rtf_pairs(clojure_files)

  pairs.each do |pair|
    input, output = pair
    system %Q{highlight -O rtf -o #{output} #{input} --font=monaco --font-size=20 --style=seashell}
  end
end

def rtf_pairs(source_files)
  rtf_pair = source_files.map do |filename|
    file_without_extension = filename.chars.take_while { |x| x != "." }.join
    [filename, file_without_extension + ".rtf"]
  end
end
