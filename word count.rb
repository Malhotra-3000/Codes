# Function to count word frequencies in a file
def count_word_frequency(filename)
  word_count = Hash.new(0)

  # Read the file line by line
  File.foreach(filename) do |line|
    words = line.split

    # Count each word
    words.each do |word|
      cleaned_word = word.downcase.gsub(/[^a-z]/, '')
      word_count[cleaned_word] += 1 unless cleaned_word.empty?
    end
  end

  word_count
end

# Function to display the word frequencies
def display_word_frequencies(word_count)
  word_count.sort_by { |word, count| -count }.each do |word, count|
    puts "#{word}: #{count}"
  end
end

# Main script execution
if ARGV.length != 1
  puts "Usage: ruby word_counter.rb <filename>"
  exit
end

filename = ARGV[0]

if File.exist?(filename)
  word_count = count_word_frequency(filename)
  display_word_frequencies(word_count)
else
  puts "File not found: #{filename}"
end
