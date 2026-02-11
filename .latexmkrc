$pdf_mode = 1;
$pdflatex = 'pdflatex -interaction=nonstopmode -file-line-error -synctex=1 -shell-escape %O %S';
$bibtex = 'bibtex %O %B';
$bibtex_use = 1;
$preview_continuous_mode = 1;
$max_repeat = 5;
$silent = 1;
@generated_exts = qw(aux bbl blg fdb_latexmk fls log out toc lof lot);
