section .text
global _start; must be declared for linker(id)
_start: ;tell linker entry point
mov edx,len; message length
mov ecx,msg ;message to write
mov ebx,1 ; file descriptor (stdout)
mov eax,4 ;system call number (sys_write)
int 0x80 ;call kernel
mov eax,1 ; system call number (sys_exit)
int 0x80 ;call kernel
section .data
msg db "hello 0x008800",0xa ; our string
len equ $ - msg ; length of our dear string

;comment
;
; apt-get install nasm
; nasm -f elf64 hello.asm
; ld -s -o hello hello.o
; ./hello
;
;valid output formats for -f are (`*' denotes default):
;  * bin       flat-form binary files (e.g. DOS .COM, .SYS)
;    ith       Intel hex
;    srec      Motorola S-records
;    aout      Linux a.out object files
;    aoutb     NetBSD/FreeBSD a.out object files
;    coff      COFF (i386) object files (e.g. DJGPP for DOS)
;    elf32     ELF32 (i386) object files (e.g. Linux)
;    elf       ELF (short name for ELF32) 
;    elf64     ELF64 (x86_64) object files (e.g. Linux)
;    as86      Linux as86 (bin86 version 0.3) object files
;    obj       MS-DOS 16-bit/32-bit OMF object files
;    win32     Microsoft Win32 (i386) object files
;    win64     Microsoft Win64 (x86-64) object files
;    rdf       Relocatable Dynamic Object File Format v2.0
;    ieee      IEEE-695 (LADsoft variant) object file format
;    macho32   NeXTstep/OpenStep/Rhapsody/Darwin/MacOS X (i386) object files
;    macho     MACHO (short name for MACHO32)
;    macho64   NeXTstep/OpenStep/Rhapsody/Darwin/MacOS X (x86_64) object files
;    dbg       Trace of all info passed to output stage
